package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EmailUnresolvedFulfilmentRequestDTO extends UnresolvedFulfilmentRequestDTO {
  private String email;
}
