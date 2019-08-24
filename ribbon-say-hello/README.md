###  使用Ribbon和SpringCloud实现客户端负载均衡     
#### 1、Ribbon介绍    
Ribbon是一个内置于服务消费者(客户端)的负载均衡器，能够对服务提供者发起调用时，实现负载均衡的处理。客户端访问服务提供者方式有三种：     
(1)直接访问: 直接对服务提供者发起调用，没有负载均衡的能力和容错保证。    
(2)自己维护服务地址列表 编程效率低，手动维护成本。     
(3)通过eureka注册中心进行查找 推荐使用eureka注册中心查找，实现透明目的。   

2、创建say-hello模块 


本实例通过设置三个不同的启动端口（8082,8083,8084）结合ribbon-consumer-user1模块实现负载均衡。    

访问：http://localhost:8086/hi?name=liuhefei

ribbon-say-hello: 消费的服务端   
ribbon-consumer-user:  消费的消费端   
ribbon-consumer-user1:  消费的消费端
