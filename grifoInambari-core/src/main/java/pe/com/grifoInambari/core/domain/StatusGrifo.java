package pe.com.grifoInambari.core.domain;

public class StatusGrifo extends BaseType  {
	
	private static final long serialVersionUID = 1L;

	public enum Status {
		GRIFO_ACT("GRIFO_ACT"), GRIFO_INACT("GRIFO_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
