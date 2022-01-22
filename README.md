# spring-boot-kafka-example

Download apache kafka binary : https://archive.apache.org/dist/kafka/2.8.1/kafka_2.12-2.8.1.tgz

Step1 : Start zookeeper

For start zookeeper open a CMD in kafka downloaded folder and run bellow command.

```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

Step2 : Start Apache kafka

Open a new CMD and run bellow command.

```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

Step3 : Create a topic with name **Test-Topic**, that has only one partition & one replica.

Open a new CMD and run bellow command and then send a message.
```
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Test-Topic
```

Step4 : start the consumer which listens to the topic **Test-Topic** we just created above.

```
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning
```

#Using Spring boot App

Get Request: 
http://localhost:9000/publish?message=messages

