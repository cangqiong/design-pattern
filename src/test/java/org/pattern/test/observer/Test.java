package org.pattern.test.observer;

/**
 * 观察者测试类
 */
public class Test {
    public static void main(String[] args) {
        Magine fashonMagine = new Magine("fashon", 20);
        People zhangsan = new People("zhangsan");
        zhangsan.subscribeMagine(fashonMagine);
        fashonMagine.setContent("The news");
        System.out.println(zhangsan.getNews());
    }
}

class Magine {
    private String name;
    private double cost;
    private String content;
    private String desc;
    private boolean isChange = false;

    public Magine(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getNews() {
        if (isChange) {
            return content;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (this.content == null || !this.content.equals("content")) {
            isChange = true;
        } else {
            isChange = false;
        }
        this.content = content;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

class People {
    private String name;
    private Magine magine;

    public People(String name) {
        this.name = name;
    }

    public void subscribeMagine(Magine magine) {
        this.magine = magine;
        // ...
    }

    public String getNews() {
        return magine.getNews();
    }
}
