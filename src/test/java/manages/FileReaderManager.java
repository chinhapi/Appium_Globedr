package manages;

import dataProvider.ConfigFileReader;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    public ConfigFileReader configFileReader;

    public static FileReaderManager getInstance(){
        return fileReaderManager;
}
    public ConfigFileReader getCofigFileReader(){
        return (configFileReader == null)? new ConfigFileReader():configFileReader;
    }
}
