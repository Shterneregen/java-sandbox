package LegacyRegistrar.legacy;

@Singleton
public class DefaultLegacyService implements LegacyService{
	@Override
	public void doWork() {
		System.out.println("Legacy. And I'm working!");
	}
}
