package by.averest.configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class BackupConfiguration {

    private String name;
    private ConsumerConfiguration consumerConfiguration;
    private ProducerConfiguration[] producerConfigurations;
    private String scheduling;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsumerConfiguration getConsumerConfiguration() {
        return consumerConfiguration;
    }

    public void setConsumerConfiguration(ConsumerConfiguration consumerConfiguration) {
        this.consumerConfiguration = consumerConfiguration;
    }

    public ProducerConfiguration[] getProducerConfigurations() {
        return producerConfigurations;
    }

    public void setProducerConfigurations(ProducerConfiguration[] producerConfigurations) {
        this.producerConfigurations = producerConfigurations;
    }

    public String getScheduling() {
        return scheduling;
    }

    public void setScheduling(String scheduling) {
        this.scheduling = scheduling;
    }
}
