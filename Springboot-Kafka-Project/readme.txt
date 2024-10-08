 Wikimedia Real-Time Data Analysis

Overview

The Wikimedia Real-Time Data Analysis project aims to analyze user engagement and identify popular topics using real-time data streams from the Wikimedia API. The project leverages Kafka for message brokering, Spring Boot for microservices, and SQL Server for data persistence, enabling timely insights into user behavior and content engagement trends.

Features

- High-Performance Producer Microservice: Ingests real-time data streams from the Wikimedia API for user engagement analysis.
- Resilient Consumer Microservice: Processes hundreds of Kafka messages per minute and stores them in SQL Server for further analysis.
- Data Analysis: Provides insights into user behavior and content engagement trends through stored data.

Technologies

- Apache Kafka: For message brokering and real-time data processing.
- Spring Boot: For building and deploying microservices.
- SQL Server: For data storage and retrieval.
- Wikimedia API: To fetch real-time data streams.

Getting Started

To get a local copy up and running, follow these steps.

Prerequisites

- Java 17 or later
- Apache Kafka
- SQL Server
- Maven

Installation

1. Clone the repository:
   
   git clone https://github.com/Vangariprashanth/SpringBoot/tree/611e3f359efb0111ba265730d15e2c073acdddc3/Springboot-Kafka-Project
   

2. Navigate to Kafka folder. In my case it is c:Kafka

3. Start Zookeeper:
   
   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
   

4. Start Kafka Broker: 
   
   .\bin\windows\kafka-server-start.bat .\config\server.properties


5. Create Kafka topic:
   .\bin\windows\kafka-topics.bat --create --topic wikimedia_recentchange --bootstrap-server localhost:9092


6. Go to `springboot-kafka-project\kafka-producer-wikimedia\src\main\java\com\prashanthvangari\SpringBootProducerApplication.java`

7. Go to `springboot-kafka-project\kafka-consumer-database\src\main\java\com\prashanthvangari\SpringBootConsumerApplication.java`

Extra:
- Consumer:
   .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic wikimedia_recentchange --from-beginning
