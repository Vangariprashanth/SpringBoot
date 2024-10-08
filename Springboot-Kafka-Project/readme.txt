Details:
Database: SQL Server

Navigate to Kafka folder. In my case it is c:Kafka
1. Start Zookeeper:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start Kafka Broker: 
.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Create kafka topic:
.\bin\windows\kafka-topics.bat --create --topic wikimedia_recentchange --bootstrap-server localhost:9092

4. Go to springboot-kafka-project\kafka-producer-wikimedia\src\main\java\com\prashanthvangari\SpringBootProducerApplication.java
5. Go to springboot-kafka-project\kafka-consumer-database\src\main\java\com\prashanthvangari\SpringBootConsumerApplication.java

Extra:-
Consumer
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic wikimedia_recentchange --from-beginning


