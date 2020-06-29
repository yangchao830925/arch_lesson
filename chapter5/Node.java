package org.infoq.com.ch5;

/**
 * Created by yangchao on 2020/6/28.
 */
public class Node {

    private String ip;
    private String name;

    public Node(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
