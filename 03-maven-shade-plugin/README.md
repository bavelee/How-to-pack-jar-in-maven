## 03-maven-shade-plugin

#### 打包方式 
默认会执行`maven-jar-plugin`，暂且掠过无视，我们不需要配置，一个 `maven-shade-plugin` 

#### 打包成品
和`maven-assembly-plugin` 一样的FatJar，依赖也被打包进去了，还可以对依赖的包名进行重写。

#### 使用方式
直接运行Jar包

#### 优点
运行方便，不用把注意力放在依赖上，直接`java -jar`运行即可

#### 缺点
每次都要完整打包，效率相比`maven-jar-plugin` 结合 `maven-dependency-plugin`要更低一些

