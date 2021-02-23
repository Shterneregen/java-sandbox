package demo.DynamicPointcut.logic;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@AllArgsConstructor
public class PatientStatus {
	Boolean positive;
	LocalDateTime when;
}
