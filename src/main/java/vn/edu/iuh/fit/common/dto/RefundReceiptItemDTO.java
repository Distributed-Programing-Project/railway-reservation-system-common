package vn.edu.iuh.fit.common.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RefundReceiptItemDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String ticketId;
  private String passengerName;
  private String passengerDocument;

  private String trainCode;
  private String departureStation;
  private String destinationStation;
  private LocalDateTime departureTime;
  private String carriageName;
  private String seatNumber;

  private double originalAmount;
  private double refundFee;
  private double refundAmount;
}

