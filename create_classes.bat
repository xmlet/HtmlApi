ECHO START
if exist "./src/main/java" rmdir "./src/main/java" /s /q
if not exist "./target/classes/org/xmlet/htmlapi" mkdir "./target/classes/org/xmlet/htmlapi"
call mvn exec:java -D"exec.mainClass"="org.xmlet.xsdasm.main.XsdAsmMain" -D"exec.args"="./src/main/resources/html_5.xsd htmlapi"
ECHO MID
if not exist "./src/main/java/org/xmlet/htmlapi" mkdir "./src/main/java/org/xmlet/htmlapi"
call mvn exec:java -D"exec.mainClass"="org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler" -D"exec.args"="-dgs=true ./target/classes/org/xmlet/htmlapi ./src/main/java/org/xmlet/htmlapi"
if exist "./target/classes/org" rmdir "./target/classes/org" /s /q
ECHO END