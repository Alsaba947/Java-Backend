package com.example.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "DSData")
public class DSData {

    
    @MongoId(targetType = FieldType.STRING)
    private String id;

    private String IP;

    private String sourceIp;

    private int port;

    private String secondaryIP;

    private int secondaryPort;

    private String projectID;

    private String acquirerID;

    private String terminalID;

    private String testMode;

    private String secondaryTestMode;

    private String libraryVersion;

    private String secondaryLibraryVersion;

}
