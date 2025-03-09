
# 文件结构
```
controller    控制层

converter     为了隔离业务逻辑和数据传输，DTO对象和实体类对象的相互转换
dto           数据传输对象

entity        实体类对象
repository    数据访问层，集成JPA

pom.xml       项目基本信息、依赖管理、插件管理、构建配置等
```

# 说明
## MAVEN
maven本身的配置文件位于maven/conf/settings.xml，在仓库的other/settings.xml中有备份，供参考。实现了镜像源配置和反向代理配置。


# 工作日志
- 3/9：完成了Java, springboot, maven, IDEA的安装，使用github进行项目管理

# TODO
- [ ] 实现和mysql容器微服务的连接，目前计划只用jpa以及jdbc，暂不打算使用mybatis
- [ ] 设计文档
- [ ] 进行内容的走量式填充


