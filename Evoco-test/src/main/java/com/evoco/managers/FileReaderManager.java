package com.evoco.managers;

import com.evoco.filereader.ConfigFileReader;

public class FileReaderManager {

    public ConfigFileReader configFileReader;

    public ConfigFileReader getConfigFileReader() {
        return (this.configFileReader == null) ? new ConfigFileReader() : this.configFileReader;
    }
}
