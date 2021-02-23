package BeanRegistrar.registrator;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class CCL extends ClassLoader {

	@Override
	@SneakyThrows
	public Class<?> findClass(String className) {
		String fileName = "target/classes/" + className.replace('.', File.separatorChar) + ".class";
		byte[] bytecode = StreamUtils.copyToByteArray(Files.newInputStream(Paths.get(fileName)));
//		byte[] bytecode = Files.newInputStream(Path.of(fileName)).readAllBytes();
		return defineClass(className, bytecode, 0, bytecode.length);
	}
}
