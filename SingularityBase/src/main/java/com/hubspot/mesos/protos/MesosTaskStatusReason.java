package com.hubspot.mesos.protos;

public enum  MesosTaskStatusReason {
  REASON_COMMAND_EXECUTOR_FAILED, REASON_CONTAINER_LAUNCH_FAILED, REASON_CONTAINER_LIMITATION, REASON_CONTAINER_LIMITATION_DISK,
  REASON_CONTAINER_LIMITATION_MEMORY, REASON_CONTAINER_PREEMPTED, REASON_CONTAINER_UPDATE_FAILED, REASON_EXECUTOR_REGISTRATION_TIMEOUT,
  REASON_EXECUTOR_REREGISTRATION_TIMEOUT, REASON_EXECUTOR_TERMINATED, REASON_EXECUTOR_UNREGISTERED, REASON_FRAMEWORK_REMOVED, REASON_GC_ERROR,
  REASON_INVALID_FRAMEWORKID, REASON_INVALID_OFFERS, REASON_IO_SWITCHBOARD_EXITED, REASON_MASTER_DISCONNECTED, REASON_RECONCILIATION,
  REASON_RESOURCES_UNKNOWN, REASON_SLAVE_DISCONNECTED, REASON_SLAVE_REMOVED, REASON_SLAVE_REMOVED_BY_OPERATOR, REASON_SLAVE_RESTARTED,
  REASON_SLAVE_UNKNOWN, REASON_TASK_CHECK_STATUS_UPDATED, REASON_TASK_GROUP_INVALID, REASON_TASK_GROUP_UNAUTHORIZED,
  REASON_TASK_HEALTH_CHECK_STATUS_UPDATED, REASON_TASK_INVALID, REASON_TASK_KILLED_DURING_LAUNCH, REASON_TASK_UNAUTHORIZED,
  REASON_TASK_UNKNOWN
}
