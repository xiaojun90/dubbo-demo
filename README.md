# dubbo-demo
分布式服务框架dubbo学习demo，系列文章可参考：https://xiaojun90.github.io/blog/series/dubbo/

---

依赖说明：

- jdk: 1.8
- maven: 3.3.9
- zookeeper: 3.4.5
- dubbo: 2.7.0

---

模块说明：

- dubbo-demo-api:公共模块，用于定义接口，其它模块依赖于此模块
- dubbo-demo-provider:提供者模块，暴露服务
- dubbo-demo-consumer:消费者模块，远程调用服务
- dubbo-demo-annotation: 是基于注解的方式使用dubbo，包含了提供者和消费者的实现。


