documentation
<a href="https://karatelabs.github.io/karate/karate-core/" >Click</a>

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

NOTE FOR UI
1. TO HOOK INTO A SELECTOR E.G ON GITHUB USER NAME TO LOGIN, INSPECT THE USERNAME FIELD THEN ON THE ELEMENT, COPY THE FULL XPATH