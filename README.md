[![Maven Central](https://img.shields.io/maven-central/v/com.github.xmlet/htmlApi.svg)](https://search.maven.org/#artifactdetails%7Ccom.github.xmlet%7ChtmlApi%7C1.0.6%7Cjar)
[![Build](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiTest&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)
[![Coverage](https://sonarcloud.io/api/badges/measure?key=com.github.xmlet%3AhtmlApiTest&metric=coverage)](https://sonarcloud.io/component_measures/domain/Coverage?id=com.github.xmlet%3AhtmlApiTest)
[![Vulnerabilities](https://sonarcloud.io/api/badges/measure?key=com.github.xmlet%3AhtmlApiTest&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)
[![Bugs](https://sonarcloud.io/api/badges/measure?key=com.github.xmlet%3AhtmlApiTest&metric=bugs)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)

# HtmlApi

<div align="justify"> 
    HtmlApi is a fluent java API that represents the HTML5 syntax in a java environment. It follows the xml schema 
    definition for the HTML5 language, which means that all the syntax rules are enforced, being value restrictions on 
    attribute values or element organization. This API can be used in multiple ways, since all the elements present 
    implement the Visitor pattern, so it is possible to define your own Visitor implementation for objectives such as 
    writing well formed to a text file, a stream, a database, etc.   
    <br />
    <br />
    All the code present in this library was automatically generated based on the XSD file of HTML5. In order to 
    generate this code some additional libraries were needed such as <a href="https://github.com/xmlet/XsdAsm">XsdAsm</a>
    , <a href="https://github.com/xmlet/XsdParser">XsdParser</a> and <a href="http://asm.ow2.org/">ASM</a>. 
    More information of how this library was generated will be added further.
</div>

## Installation

<div align="justify"> 
    First, in order to include it to your Maven project, simply add this dependency:
    <br />
    <br />
</div>

```xml
<dependency>
    <groupId>com.github.xmlet</groupId>
    <artifactId>htmlApi</artifactId>
    <version>1.0.8</version>
</dependency>
``` 

## Usage

<div align="justify"> 
    Below it is presented a java example that shows how the API works. It has the following HTML as base.
    <br />
    <br />
</div>

```xml
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>
            Title
        </title>
        <link type="text/css" href="/assets/images/favicon.png" />
        <link type="text/css" href="assets/styles/main.css" />
    </head>
    <body class="clear">
        <div id="col-wrap">
            <header id="header">
                <section class="contain clear">
                    <div class="logo">
                        <img id="brand" src="./assets/images/logo.png" />
                    </div>
                    <aside>
                        <em>
                            Advertisement: <span class="number">HtmlApi is great!</span>
                        </em>
                    </aside>
                </section>
            </header>
        </div>
    </body>
</html>
```

```java
public class HtmlApiExample {
    public void simpleAPIUsage(){
        Html<Html> root = new Html<>();

        root.head()
                .meta().attrCharset("UTF-8").º()
                .title()
                    .text("Title").º()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/images/favicon.png").º()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/styles/main.css").º().º()
            .body().attrClass("clear")
                .div()
                    .header()
                        .section()
                            .div()
                                .img().attrId("brand").attrSrc("./assets/images/logo.png").º()
                                .aside()
                                    .em()
                                        .text("Advertisement: ")
                                    .span()
                                        .text("HtmlApi is great!");
    }
}
```

<div align="justify"> 
    Now, in order to achieve some results with the code presented above a concrete implementation of a Visitor is needed.
    There are two existing classes in order to support the Visitor pattern, the ElementVisitor interface which has a method
    for every element class that exists in a given API and AbstractElementVisitor which provides a simplified ElementVisitor
    interface. In AbstractElementVisitor there are methods for every API element, but in this case each method calls a single
    shared method. This means that if all your elements share a behaviour it is possible to just redefine that single method
    or even if only some methods have diferent behaviour it is possible to implement the shared behaviour in the shared method
    and override the implementation of the ones that have diferent behaviour.
    Showing as an example a very basic implementation of a Visitor we can have a Visitor that writes the html to the 
    console. It does not indent the HTML but it shows that implementing a simple Visitor requires very few lines of code.
    <br />
    <br />   
</div>

```java
public class ConsoleVisitor<R> extends AbstractElementVisitor<R> {

    private PrintStream printStream = new PrintStream(System.out);

    public ConsoleVisitor(){}
    
    @Override
    public <T extends Element> void visit(Element<T, ?> element) {
        printStream.printf("<%s>\n", element.getName());

        element.getChildren().forEach(item -> item.accept(this));
    
        printStream.printf("</%s>\n", element.getName());
    }
}
```

<div align="justify"> 
    A more complete example of a Visitor can be checked at:
    <br />
    <br />
    <a href="https://github.com/xmlet/HtmlApiTest/blob/master/src/test/java/org/xmlet/htmlapitest/Utils/CustomVisitor.java">Visitor full example</a>
</div>

### Element binding

<div align="justify"> 
    In order to support repetitive tasks over an element binders were implemented. This allows for users to define, 
    for example, templates for a given element. An example is presented below.
    <br />
    <br />
</div>

````java
public class BinderExample{
    public void bindExample(){
        Html<Html> root = new Html<>();
        Body<Html<Html>> body = root.body();
        
        Table<Body<Html<Html>>> table = body.table();
        table.tr().th().text("Title");
        table.<List<String>>binder((elem, list) ->
                        list.forEach(tdValue ->
                            elem.tr().td().text(tdValue)
                        )
                    );
        
        //Keep adding elements to the body of the document.
    }
}
````

<div align="justify"> 
    In this example a table is created, and a title is added in the first row as a title header. In regard to the values 
    present in the table instead of having them inserted right away it is possible delay that insertion by indicating 
    what will the element do when the information is received. This way a template can be defined and reused with 
    different values. A full example of how this works is available at the method <a href="https://github.com/xmlet/HtmlApiTest/blob/master/src/test/java/org/xmlet/htmlapitest/HtmlApiTest.java">testBinderUsage</a>.
</div>

## Code Quality

<div align="justify"> 
    In order to test this library some tests were made, some directly test existing features and others just used 
    reflection in order to navigate the API in order to check for unexpected behaviour. These tests cover most of the 
    code, if you are interested in verifying the code quality, vulnerabilities and other various metrics, 
    check the following link:
    <br />
    <br />
    <a href="https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest">Sonarcloud Statistics</a>
</div>
  
## Final remarks

<div align="justify">  
    Even though this API is created based on aumatically generated classes there are a few nuances. In order to provide 
    API users with source files and java documentation of the API, the automatically generated classes are decompiled, 
    using <a href="https://mvnrepository.com/artifact/org.jboss.windup.decompiler/decompiler-fernflower/4.0.0.Final">Fernflower Decompiler used by Intellij</a>, 
    and then compiled regularly by the maven lifecycle. This process, apart from allowing the API users to have the 
    source and documention files also allows to verify that there are no compiler problems with the code, which is very 
    helpful when making changes in the way that this API is generated.
</div>
