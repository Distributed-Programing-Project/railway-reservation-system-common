package vn.edu.iuh.fit.common.dto;

import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.common.constant.InvoiceType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceFilterDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "requestEmployeeId is required")
    private String requestEmployeeId;
    private String filterEmployeeId;
    private String keyword;
    private Integer day;
    private Integer month;
    private Integer year;
    private InvoiceType type;
    private int page;
    private int size;
}
