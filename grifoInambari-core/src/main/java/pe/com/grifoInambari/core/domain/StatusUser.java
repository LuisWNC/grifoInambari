package pe.com.grifoInambari.core.domain;

public class StatusUser extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Status {
		USER_ACT("USER_ACT"), USER_INACT("USER_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
