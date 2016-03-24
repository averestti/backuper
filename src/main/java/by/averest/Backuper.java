package by.averest;

import by.averest.configuration.BackupConfiguration;
import by.averest.configuration.Configuration;
import by.averest.configuration.ConsumerConfiguration;
import by.averest.configuration.ProducerConfiguration;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Backuper {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(getConfigurationTemplate());
    }

    public static String getConfigurationTemplate() throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();

        final ConsumerConfiguration consumerConfiguration = new ConsumerConfiguration();
        consumerConfiguration.setName("Consumer1");
        consumerConfiguration.setConfigurationFile("Consumer1 Config");

        final ProducerConfiguration producerConfiguration = new ProducerConfiguration();
        producerConfiguration.setName("Producer1");
        producerConfiguration.setCount(1);
        producerConfiguration.setConfigurationFile("Producer1 Config");

        final BackupConfiguration backupConfiguration = new BackupConfiguration();
        backupConfiguration.setName("Backup1");
        backupConfiguration.setConsumerConfiguration(consumerConfiguration);
        backupConfiguration.setProducerConfigurations(new ProducerConfiguration[]{producerConfiguration});

        backupConfiguration.setScheduling("Cron Like Scheduling");

        final Configuration configuration = new Configuration();
        configuration.setName("Backuper");
        configuration.setTmpFolder("tmp");
        configuration.setBackupConfigurations(new BackupConfiguration[]{backupConfiguration});
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(configuration);
    }

}
