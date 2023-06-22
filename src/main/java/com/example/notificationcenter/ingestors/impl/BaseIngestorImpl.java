package com.example.notificationcenter.ingestors.impl;

import com.example.notificationcenter.ingestors.BaseIngestor;

public abstract class BaseIngestorImpl implements BaseIngestor {
    @Override
    public void processData() {
        try {
            ingest();
        } catch (Exception e) {
            postIngestIfFailed();
        }
    }
    abstract void preIngest();
    abstract void ingest();
    abstract void postIngestIfSuccess();
    abstract void postIngestIfFailed();

    public static class EmailIngestorImpl {
    }
}
