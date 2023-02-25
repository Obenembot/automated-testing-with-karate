
Add the following dependencies to a maven project to enable karate

1. karate-apache
2. karate-junit5

Add this to the build path

 <testResources>
            <testResource>
                <directory>src/test/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </testResource>
 </testResources>