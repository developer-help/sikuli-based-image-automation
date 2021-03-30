# sikuli-based-image-automation
Source code Repo link

https://github.com/developer-help/sikuli-based-image-automation

1. Create a maven project from command line with default archetype

mvn archetype:generate -DgroupId=com.help.auto -DartifactId=siku 
-DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

2. Open project in eclipse/other editor

3. Open pom.xml and Add dependency of Sikuli to the project

<dependency>
			<groupId>com.sikulix</groupId>
			<artifactId>sikulixapi</artifactId>
			<version>2.0.0</version>
</dependency>

4. Create a class name OpenChrome.java
5. Add a method that dipicts right clickin the windows icon
6. Click on run menu item
7. Type chorome in the input box
8. click okie
9. Compile and Run the applicaiton from eclipse commandline
