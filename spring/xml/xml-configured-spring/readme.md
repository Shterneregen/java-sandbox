
[Евгений Борисов — Spring-потрошитель, часть 1](https://www.youtube.com/watch?v=BmBr5diz8WA)  
[Евгений Борисов — Spring-потрошитель, часть 2](https://www.youtube.com/watch?v=cou_qomYLNU)  

MBeans can be managed in jvisualvm.exe (MBeans plugin)  

How to find all beans in context:
```
context.getBeanDefinitionNames()
```

###### 3 phases of initialization:
* Constructor
* @PostConstruct
* ApplicationListener
