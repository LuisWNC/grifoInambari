package pe.com.grifoInambari.core.domain;

public class StatusRole  extends BaseType{

	
	private static final long serialVersionUID = 1L;

	public enum Status {
		ROLE_ACT("ROLE_ACT"), ROLE_INACT("ROLE_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
