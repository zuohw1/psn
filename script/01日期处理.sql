/*基本信息表日期空值处理*/
update ehrbase_emp_basic set effective_end_date = null where effective_end_date = '0000-00-00';

update ehrbase_emp_basic set ehrbase_emp_basic.add_staff_date = null where add_staff_date = '0000-00-00';

update ehrbase_emp_basic set effective_start_date = null where effective_start_date = '0000-00-00';
update ehrbase_emp_basic set date_of_birth = null where date_of_birth = '0000-00-00';
update ehrbase_emp_basic set plan_of_retirement_date = null where plan_of_retirement_date = '0000-00-00';
update ehrbase_emp_basic set initial_job_start_date = null where initial_job_start_date = '0000-00-00';
update ehrbase_emp_basic set working_ages_start_date = null where working_ages_start_date = '0000-00-00';

update ehrbase_emp_basic set join_cuc_date = null where join_cuc_date = '0000-00-00';
update ehrbase_emp_basic set join_office_date = null where join_office_date = '0000-00-00';
update ehrbase_emp_basic set create_date = null where create_date = '0000-00-00 00:00:00';
update ehrbase_emp_basic set update_date = null where update_date = '0000-00-00';

update ehrbase_emp_qualifications_app set qualification_end_date = NULL where qualification_end_date = '0000-00-00';
	update ehrbase_emp_qualifications_app set qualification_awarded_date = NULL where qualification_awarded_date = '0000-00-00';