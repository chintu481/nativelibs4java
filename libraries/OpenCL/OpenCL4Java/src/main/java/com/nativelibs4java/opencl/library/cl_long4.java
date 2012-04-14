package com.nativelibs4java.opencl.library;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("OpenCL") 
public class cl_long4 extends StructObject {
	public cl_long4() {
		super();
	}
	/// C type : cl_long[4]
	@Array({4}) 
	@Field(0) 
	public Pointer<Long > s() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : field1_struct
	@Field(1) 
	public com.nativelibs4java.opencl.library.cl_char2.field1_struct field1() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : field1_struct
	@Field(1) 
	public cl_long4 field1(com.nativelibs4java.opencl.library.cl_char2.field1_struct field1) {
		this.io.setNativeObjectField(this, 1, field1);
		return this;
	}
	/// C type : field2_struct
	@Field(2) 
	public com.nativelibs4java.opencl.library.cl_char2.field2_struct field2() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : field2_struct
	@Field(2) 
	public cl_long4 field2(com.nativelibs4java.opencl.library.cl_char2.field2_struct field2) {
		this.io.setNativeObjectField(this, 2, field2);
		return this;
	}
	/// C type : field3_struct
	@Field(3) 
	public com.nativelibs4java.opencl.library.cl_char2.field3_struct field3() {
		return this.io.getNativeObjectField(this, 3);
	}
	/// C type : field3_struct
	@Field(3) 
	public cl_long4 field3(com.nativelibs4java.opencl.library.cl_char2.field3_struct field3) {
		this.io.setNativeObjectField(this, 3, field3);
		return this;
	}
	public static class field1_struct extends StructObject {
		public field1_struct() {
			super();
		}
		/// C type : cl_long
		@Field(0) 
		public long x() {
			return this.io.getLongField(this, 0);
		}
		/// C type : cl_long
		@Field(0) 
		public field1_struct x(long x) {
			this.io.setLongField(this, 0, x);
			return this;
		}
		/// C type : cl_long
		@Field(1) 
		public long y() {
			return this.io.getLongField(this, 1);
		}
		/// C type : cl_long
		@Field(1) 
		public field1_struct y(long y) {
			this.io.setLongField(this, 1, y);
			return this;
		}
		/// C type : cl_long
		@Field(2) 
		public long z() {
			return this.io.getLongField(this, 2);
		}
		/// C type : cl_long
		@Field(2) 
		public field1_struct z(long z) {
			this.io.setLongField(this, 2, z);
			return this;
		}
		/// C type : cl_long
		@Field(3) 
		public long w() {
			return this.io.getLongField(this, 3);
		}
		/// C type : cl_long
		@Field(3) 
		public field1_struct w(long w) {
			this.io.setLongField(this, 3, w);
			return this;
		}
		public field1_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field2_struct extends StructObject {
		public field2_struct() {
			super();
		}
		/// C type : cl_long
		@Field(0) 
		public long s0() {
			return this.io.getLongField(this, 0);
		}
		/// C type : cl_long
		@Field(0) 
		public field2_struct s0(long s0) {
			this.io.setLongField(this, 0, s0);
			return this;
		}
		/// C type : cl_long
		@Field(1) 
		public long s1() {
			return this.io.getLongField(this, 1);
		}
		/// C type : cl_long
		@Field(1) 
		public field2_struct s1(long s1) {
			this.io.setLongField(this, 1, s1);
			return this;
		}
		/// C type : cl_long
		@Field(2) 
		public long s2() {
			return this.io.getLongField(this, 2);
		}
		/// C type : cl_long
		@Field(2) 
		public field2_struct s2(long s2) {
			this.io.setLongField(this, 2, s2);
			return this;
		}
		/// C type : cl_long
		@Field(3) 
		public long s3() {
			return this.io.getLongField(this, 3);
		}
		/// C type : cl_long
		@Field(3) 
		public field2_struct s3(long s3) {
			this.io.setLongField(this, 3, s3);
			return this;
		}
		public field2_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field3_struct extends StructObject {
		public field3_struct() {
			super();
		}
		/// C type : cl_long2
		@Field(0) 
		public cl_long2 lo() {
			return this.io.getNativeObjectField(this, 0);
		}
		/// C type : cl_long2
		@Field(0) 
		public field3_struct lo(cl_long2 lo) {
			this.io.setNativeObjectField(this, 0, lo);
			return this;
		}
		/// C type : cl_long2
		@Field(1) 
		public cl_long2 hi() {
			return this.io.getNativeObjectField(this, 1);
		}
		/// C type : cl_long2
		@Field(1) 
		public field3_struct hi(cl_long2 hi) {
			this.io.setNativeObjectField(this, 1, hi);
			return this;
		}
		public field3_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public cl_long4(Pointer pointer) {
		super(pointer);
	}
}
