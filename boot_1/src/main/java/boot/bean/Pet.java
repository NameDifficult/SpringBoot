package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Mi
 * @Date 2022/4/5 17:14
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString //自动生成toString
@Data //自动生成get、set方法
public class Pet {
    private String name;
}
