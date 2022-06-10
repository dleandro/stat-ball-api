package org.dlea.common.model;

public class CustomResponse<T> {

    private boolean isResultSuccessful;
    private T objectToReturn;

    public CustomResponse(boolean isResultSuccessful) {
        this.isResultSuccessful = isResultSuccessful;
    }

    public CustomResponse(T objectToReturn, boolean isResultSuccessful) {
        this.objectToReturn = objectToReturn;
        this.isResultSuccessful = isResultSuccessful;
    }

    public boolean isResultSuccessful() {
        return isResultSuccessful;
    }

    public void setResultSuccessful(boolean resultSuccessful) {
        isResultSuccessful = resultSuccessful;
    }

    public T getObjectToReturn() {
        return objectToReturn;
    }

    public void setObjectToReturn(T objectToReturn) {
        this.objectToReturn = objectToReturn;
    }
}
