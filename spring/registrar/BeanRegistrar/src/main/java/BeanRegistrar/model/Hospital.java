package BeanRegistrar.model;

public interface Hospital {
	void register(String myType, Healer healer);
	void processPatient(Patient patient);
}
