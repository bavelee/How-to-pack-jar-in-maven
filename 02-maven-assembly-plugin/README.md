## 02-maven-assembly-plugin

#### 打包方式 
一个 `maven-assembly-plugin` 

#### 打包成品
一个FatJar，依赖也被打包进去了。可以通过`appendAssemblyId`参数避免生成的jar包带id(会覆盖掉ThinJar)

#### 使用方式
直接运行Jar包

#### 优点
运行方便，不用把注意力放在依赖上，直接`java -jar`运行即可

#### 缺点
每次都要完整打包，效率相比`maven-jar-plugin` 结合 `maven-dependency-plugin`要更低一些

