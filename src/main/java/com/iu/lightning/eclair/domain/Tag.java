package com.iu.lightning.eclair.domain;

public class Tag
{
    private String name;
    private String value;

    public Tag()
    {
    }

    public Tag(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Tag{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}