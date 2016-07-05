package pe.com.grifoInambari.core.domain;

public class StatusAccessRole extends BaseType {

	private static final long serialVersionUID = 1L;

	public enum Status {
		ACCESSROLE_ACT("ACCESSROLE_ACT"), ACCESSROLE_INACT("ACCESSROLE_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
