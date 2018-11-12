[![Maven Central](https://img.shields.io/maven-central/v/com.github.xmlet/htmlApi.svg)](https://search.maven.org/#artifactdetails%7Ccom.github.xmlet%7ChtmlApi%7C1.0.6%7Cjar)
[![Build](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiTest&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiTest&metric=coverage)](https://sonarcloud.io/component_measures/domain/Coverage?id=com.github.xmlet%3AhtmlApiTest)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiTest&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiTest&metric=bugs)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest)

# HtmlApi

<div align="justify"> 
    HtmlApi is a fluent Java DSL for the HTML5.2 language. It follows the XML schema 
    definition, i.e. XSD, for the HTML5.2 language, which means that all the syntax rules are enforced, either being attribute 
    value restrictions or regarding element organization. This DSL can be used in multiple ways, since all the classes present 
    in this DSL implement the Visitor pattern, so it is possible to define your own Visitor implementation to manipulate the HTML language 
    for any purpose, for example, to writing well formed HTML to a text file, a stream, a database, etc.   
    <br />
    <br />
    All the code present in this library was automatically generated based a XSD file representing the rules of HTML5.2. 
    In order to generate this code some additional libraries were needed such as <a href="https://github.com/xmlet/XsdAsm">XsdAsm</a>, 
    <a href="https://github.com/xmlet/XsdParser">XsdParser</a> and <a href="http://asm.ow2.org/">ASM</a>. 
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
    Below it is presented a Java example that shows how the DSL works. It has the following HTML as base.
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
                .meta().attrCharset("UTF-8").__()
                .title()
                    .text("Title")
                .__()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/images/favicon.png").__()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/styles/main.css").__()
            .__()
            .body().attrClass("clear")
                .div()
                    .header()
                        .section()
                            .div()
                                .img().attrId("brand").attrSrc("./assets/images/logo.png").__()
                                .aside()
                                    .em()
                                        .text("Advertisement: ")
                                        .span()
                                            .text("HtmlApi is great!");
    }
}
```

<div align="justify"> 
    The DSL that the HtmlApi provides is pretty straightforward. After creating an <i>Html</i> element we can keep on
    creating the HTML element tree by invoking methods of the <i>Html</i> class. Each class that represents an HTML element,
    such as <i>Html</i>, <i>Div</i>, <i>P</i>, etc. has its respective methods, acording to the HTML5.2 language specification.
    The naming convention of the methods has two variants:
    <br />
    <br />
    <ul>
         <li>
             When adding another element - The method has the name of the element being added, i.e. calling the <i>head()</i> method 
             on the <i>root</i> variable will add a <i>head</i> instance to the <i>html</i> children list.
         </li>
         <li>
             When adding another attribute - The method name has the prefix <i>attr</i> before the attribute name.
         </li>
    </ul>
    A few notes regarding the usage of the DSL:
    <br />
    <br />
    <ul>
        <li>
            The methods which add elements to the element tree return the newly created element.
        </li>
        <li>
            The methods which add attributes to the element attributes return the element where the attribute was added.
        </li>
        <li>
            To navigate to the parent element we have the <i>__()</i> method.
        </li>
    </ul>
</div>

### The Visitor Pattern

<div align="justify">
    Having the Java code presented in the previous example how can we generate the respective HTML document? We need to implement
    the <i>ElementVisitor</i> abstract class. This class has four different abstract methods:
    <br />
    <br />
    <ul>
        <li>
            <i>sharedVisit(Element<T, ?> element)</i> - This method is called whenever a class generated based on a XSD <i>xsd:element</i> has its
            <i>accept</i> method called. By receiving the <i>Element</i> we have access to the element children and attributes.
        </li>
        <li>
            <i>visit(Text text)</i> - This method is called when the <i>accept</i> method of the special <i>Text</i> element is invoked.
        </li>
        <li>
            <i>visit(Comment comment)</i> - This method is called when the <i>accept</i> method of the special <i>Comment</i> element is invoked.
        </li>
        <li>
            <i>visit(TextFuction<R, U, ?> textFunction)</i> - This method is called when the <i>accept</i> method of the special 
                                                        <i>TextFunction</i> element is invoked.
        </li>
    </ul>
    By implementing these methods we can achieve a solution that manipulates the HTML language for any objective.
    Apart from those four methods we also have methods for each HTML element, such as <i>html</i>, <i>body</i>, <i>table</i>, etc. 
    which provides more control when defining the behaviour in the Visitor implementation. All these methods default behaviour
    is to invoke the <i>sharedVisit</i> method as shown in the following snippet of the <i>ElementVisitor</i> class.   
</div>

```java
abstract class ElementVisitor<R> {
   public abstract <T extends Element> void sharedVisit(Element<T, ?> var1);

   public abstract void visit(Text var1);

   public abstract void visit(Comment var1);

   public abstract <U> void visit(TextFunction<R, U, ?> var1);

   public void visit(Html html) {
      this.sharedVisit(html);
   }
   
   public void visit(Body body) {
      this.sharedVisit(body);
   }
   
   public void visit(Table table) {
      this.sharedVisit(table);
   }
}
```

<div align="justify"> 
    A concrete implementation of this class is present in the 
    <a href="https://github.com/xmlet/HtmlApiTest/blob/master/src/test/java/org/xmlet/htmlapitest/Utils/CustomVisitor.java">CustomVisitor</a> 
    class. In this example the HtmlApi is used to write a well formed and indented HTML document to a <i>StringBuilder</i>
    object.
</div>

### Element binding

<div align="justify">  
    The HtmlApi provides the definition of reusable templates. This allows programmers to postpone the addition of 
    information to the defined element tree. An example is shown below.
    <br />
    <br />
</div>

```java
public class BinderExample{
    public void bindExample(){
        Html<Element> root = new Html<>()
            .body()
                .table()
                    .tr()
                        .th()
                            .text("Title")
                        .__()
                    .__()
                    .<List<String>>binder((elem, list) ->
                        list.forEach(tdValue ->
                            elem.tr().td().text(tdValue)
                        )
                    )
                .__()
            .__()
        .__();
    }
 }
```

<div align="justify"> 
    In this example a <i>Table</i> instance is created, and a <i>Title</i> is added in the first row as a title header, i.e. <i>th</i>. 
    After defining the table header of the table we can see that we invoke a <i>binder</i> method. This method bounds the <i>Table</i>
    instance with a function, which defines the behaviour to be performed when this instance receives the information.
    This way a template can be defined and reused with different values. A full example of how this works is available at 
    the method <a href="https://github.com/xmlet/HtmlApiTest/blob/master/src/test/java/org/xmlet/htmlapitest/HtmlApiTest.java">testBinderUsage</a>.
    To use this approach we also need to define a concrete implementation of an <i>ElementVisitor</i> which supports element
    binding. An example of such implementation is shown in the 
    <a href="https://github.com/xmlet/HtmlApiTest/blob/master/src/test/java/org/xmlet/htmlapitest/Utils/CustomVisitor.java">CustomVisitor</a>
    class.
</div>

## Code Quality

<div align="justify"> 
    Even though the code present in this DSL is generated code we implemented some tests to assert code quality, 
    vulnerabilities and other various metrics. The results are available in the <i>xmlet</i> 
    <a href="https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiTest">Sonarcloud</a> page.
</div>
  
## Final remarks

<div align="justify">  
    Even though this DSL is created based on aumatically generated classes there are a few nuances. In order to provide 
    DSL users with source files and java documentation of the DSL, the automatically generated classes are decompiled, 
    using <a href="https://mvnrepository.com/artifact/org.jboss.windup.decompiler/decompiler-fernflower/4.0.0.Final">Fernflower Decompiler used by Intellij</a>, 
    and then compiled regularly by the maven lifecycle. This process, apart from allowing the DSL users to have the 
    source and documention files also allows to verify that there are no compiler problems with the code, which is very 
    helpful when making changes in the way that this DSL is generated.
</div>
