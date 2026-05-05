package vn.edu.iuh.fit.common.message;

public class InvoiceMessages {
    public static final String FILTER_SUCCESS = "Lọc hóa đơn thành công";
    public static final String FILTER_FAILED = "Lọc hóa đơn thất bại: ";
    public static final String DETAIL_SUCCESS = "Lấy chi tiết hóa đơn thành công";
    public static final String DETAIL_FAILED = "Lấy chi tiết hóa đơn thất bại: ";
    public static final String INVOICE_ID_REQUIRED = "Mã hóa đơn không được để trống";

    public static String employeeNotFound(String id) {
        return "Không tìm thấy nhân viên: id=" + id;
    }

    public static String employeeInactive(String id) {
        return "Nhân viên không hoạt động: id=" + id;
    }

    public static String notFound(String id) {
        return "Không tìm thấy hóa đơn: id=" + id;
    }
}
