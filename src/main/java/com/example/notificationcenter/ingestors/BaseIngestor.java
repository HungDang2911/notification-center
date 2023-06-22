package com.example.notificationcenter.ingestors;

public abstract class BaseIngestor {
    public void handleData() {
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
}
