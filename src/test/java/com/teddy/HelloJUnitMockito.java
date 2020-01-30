package com.teddy;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class HelloJUnitMockito {
	class Foo {
		Object hello() {
			return null;
		}
	}

	@Test
	void test() {
		Foo foo = mock(Foo.class);
		when(foo.hello()).thenReturn("Hello World!");
		System.out.println(foo.hello());
	}
}