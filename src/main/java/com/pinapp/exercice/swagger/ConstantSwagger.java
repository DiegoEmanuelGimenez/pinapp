package com.pinapp.exercice.swagger;

public interface ConstantSwagger {

    public static final String CREATE_CLIENT_RESPONSE_OK = "{\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"name\",\n" +
            "    \"lastname\": \"lastname\",\n" +
            "    \"age\": 20,\n" +
            "    \"birthdate\": \"2001-08-06T00:00:00Z\"\n" +
            "}";

    public static final String CREATE_CLIENT_RESPONSE_BAD_1 = "{\n" +
            "    \"timestamp\": \"2022-07-12T16:02:31.772+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"message\": \"Name can not be empty\",\n" +
            "    \"path\": \"/creacliente\"\n" +
            "}";
    public static final String CREATE_CLIENT_RESPONSE_BAD_2 = "{\n" +
            "    \"timestamp\": \"2022-07-12T16:02:31.772+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"message\": \"Lastname can not be empty\",\n" +
            "    \"path\": \"/creacliente\"\n" +
            "}";
    public static final String CREATE_CLIENT_RESPONSE_BAD_3 = "{\n" +
            "    \"timestamp\": \"2022-07-12T16:02:31.772+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"message\": \"Age can not be empty\",\n" +
            "    \"path\": \"/creacliente\"\n" +
            "}";
    public static final String CREATE_CLIENT_RESPONSE_BAD_4 = "{\n" +
            "    \"timestamp\": \"2022-07-12T16:02:31.772+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"message\": \"Birthdate can not be empty\",\n" +
            "    \"path\": \"/creacliente\"\n" +
            "}";
    public static final String CREATE_CLIENT_RESPONSE_BAD_5 = "{\n" +
            "    \"timestamp\": \"2022-07-12T16:02:31.772+00:00\",\n" +
            "    \"status\": 400,\n" +
            "    \"error\": \"Bad Request\",\n" +
            "    \"message\": \"Birthdate or Age is inconsistent\",\n" +
            "    \"path\": \"/creacliente\"\n" +
            "}";
}
