package com.java.basic;

import java.time.LocalDateTime;
import java.util.Date;

public interface AlarmWatchInterface extends WatchInterface {
	void setAlarm(Date date);
//	void setAlarm(LocalDateTime date);

}
