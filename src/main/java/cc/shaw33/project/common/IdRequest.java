package cc.shaw33.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Id请求
 *
 * @author Shaw
 *
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}