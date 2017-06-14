package org.zhao.test.tbschedule;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;
import com.taobao.pamirs.schedule.TaskItemDefine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyTask implements IScheduleTaskDealSingle<Task> {

	@Override
	public Comparator<Task> getComparator() {
		log.info("===>mytask comparator");
		return null;
	}

	@Override
	public List<Task> selectTasks(String arg0, String arg1, int arg2, List<TaskItemDefine> arg3, int arg4)
			throws Exception {
		log.info("===>mytask selectTasks");
		List<Task> list = new ArrayList<>();
		list.add(new Task());
		return list;
	}

	@Override
	public boolean execute(Task arg0, String arg1) throws Exception {
		log.info("===>mytask execute");
		return true;
	}

}
