## 01-maven-jar-plugin

#### 打包方式 
`maven-jar-plugin` 结合 `maven-dependency-plugin`
- `maven-jar-plugin` : 将用户代码打包为一个jar包
- `maven-dependency-plugin` : 复制依赖库到一个目录下，查看`pom.xml`下的outputDirectory

#### 打包成品
一个独立的jar和包含依赖的lib目录

#### 使用方式
把jar包和lib目录放置在一个路径下运行

#### 优点
- 不改动依赖时能提升打包效率，根据需要可以每次只打包用户代码的jar包
- 开发 & 测试阶段方便

#### 缺点
- 部署运行不如FatJar便利
