package Entity;

public enum  AppConfig {
    MYSQL_URL("jdbc:mysql://193.112.120.245:3306/java_experience?useUnicode=true&characterEncoding=utf8"),
    MYSQL_USER("root"),
    MYSQL_PASSWORD("yami1574150143"),
    MYSQL_DRIVER("com.mysql.cj.jdbc.Driver"),

    REDIS_URL("193.112.120.245"),
    REDIS_PORT("6379"),
    REDIS_PASSWORD("1574150143");

    private String value;

    AppConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
