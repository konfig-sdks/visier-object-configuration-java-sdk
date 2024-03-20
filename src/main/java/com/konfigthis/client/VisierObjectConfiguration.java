package com.konfigthis.client;

import com.konfigthis.client.api.ObjectConfigurationApi;

public class VisierObjectConfiguration {
    private ApiClient apiClient;
    public final ObjectConfigurationApi objectConfiguration;

    public VisierObjectConfiguration() {
        this(null);
    }

    public VisierObjectConfiguration(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.objectConfiguration = new ObjectConfigurationApi(this.apiClient);
    }

}
