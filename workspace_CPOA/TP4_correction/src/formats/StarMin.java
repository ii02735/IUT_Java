package formats;
import gerantMessages.IFormat;

public class StarMin implements IFormat {
		@Override
        public String getTexteAvecFormat(String s) {
             return s.toLowerCase();
        }

		@Override
		public String getMotif() {
			return " * ";
		}
}
