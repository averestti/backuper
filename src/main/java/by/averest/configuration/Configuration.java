package by.averest.configuration;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Configuration {

    private String name;
    private String tmpFolder;
    private BackupConfiguration[] backupConfigurations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTmpFolder() {
        return tmpFolder;
    }

    public void setTmpFolder(String tmpFolder) {
        this.tmpFolder = tmpFolder;
    }

    public BackupConfiguration[] getBackupConfigurations() {
        return backupConfigurations;
    }

    public void setBackupConfigurations(BackupConfiguration[] backupConfigurations) {
        this.backupConfigurations = backupConfigurations;
    }
}
