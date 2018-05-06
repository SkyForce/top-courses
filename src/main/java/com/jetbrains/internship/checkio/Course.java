package com.jetbrains.internship.checkio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("summary")
    @Expose
    public String summary;
    @SerializedName("workload")
    @Expose
    public String workload;
    @SerializedName("cover")
    @Expose
    public Object cover;
    @SerializedName("intro")
    @Expose
    public String intro;
    @SerializedName("course_format")
    @Expose
    public String courseFormat;
    @SerializedName("target_audience")
    @Expose
    public String targetAudience;
    @SerializedName("certificate_footer")
    @Expose
    public Object certificateFooter;
    @SerializedName("certificate_cover_org")
    @Expose
    public Object certificateCoverOrg;
    @SerializedName("is_certificate_auto_issued")
    @Expose
    public Boolean isCertificateAutoIssued;
    @SerializedName("certificate_regular_threshold")
    @Expose
    public Object certificateRegularThreshold;
    @SerializedName("certificate_distinction_threshold")
    @Expose
    public Object certificateDistinctionThreshold;
    @SerializedName("instructors")
    @Expose
    public List<Integer> instructors = null;
    @SerializedName("certificate")
    @Expose
    public String certificate;
    @SerializedName("requirements")
    @Expose
    public String requirements;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("sections")
    @Expose
    public List<Integer> sections = null;
    @SerializedName("total_units")
    @Expose
    public Integer totalUnits;
    @SerializedName("enrollment")
    @Expose
    public Object enrollment;
    @SerializedName("is_favorite")
    @Expose
    public Boolean isFavorite;
    @SerializedName("actions")
    @Expose
    public Actions actions;
    @SerializedName("progress")
    @Expose
    public Object progress;
    @SerializedName("first_lesson")
    @Expose
    public Integer firstLesson;
    @SerializedName("first_unit")
    @Expose
    public Integer firstUnit;
    @SerializedName("certificate_link")
    @Expose
    public Object certificateLink;
    @SerializedName("certificate_regular_link")
    @Expose
    public Object certificateRegularLink;
    @SerializedName("certificate_distinction_link")
    @Expose
    public Object certificateDistinctionLink;
    @SerializedName("schedule_link")
    @Expose
    public Object scheduleLink;
    @SerializedName("schedule_long_link")
    @Expose
    public Object scheduleLongLink;
    @SerializedName("first_deadline")
    @Expose
    public Object firstDeadline;
    @SerializedName("last_deadline")
    @Expose
    public Object lastDeadline;
    @SerializedName("subscriptions")
    @Expose
    public List<String> subscriptions = null;
    @SerializedName("announcements")
    @Expose
    public List<Object> announcements = null;
    @SerializedName("is_contest")
    @Expose
    public Boolean isContest;
    @SerializedName("is_self_paced")
    @Expose
    public Boolean isSelfPaced;
    @SerializedName("is_adaptive")
    @Expose
    public Boolean isAdaptive;
    @SerializedName("is_idea_compatible")
    @Expose
    public Boolean isIdeaCompatible;
    @SerializedName("last_step")
    @Expose
    public String lastStep;
    @SerializedName("intro_video")
    @Expose
    public Object introVideo;
    @SerializedName("social_providers")
    @Expose
    public List<Object> socialProviders = null;
    @SerializedName("authors")
    @Expose
    public List<Integer> authors = null;
    @SerializedName("tags")
    @Expose
    public List<Object> tags = null;
    @SerializedName("has_tutors")
    @Expose
    public Boolean hasTutors;
    @SerializedName("is_promoted")
    @Expose
    public Boolean isPromoted;
    @SerializedName("is_enabled")
    @Expose
    public Boolean isEnabled;
    @SerializedName("is_proctored")
    @Expose
    public Boolean isProctored;
    @SerializedName("proctor_url")
    @Expose
    public Object proctorUrl;
    @SerializedName("review_summary")
    @Expose
    public Integer reviewSummary;
    @SerializedName("schedule_type")
    @Expose
    public String scheduleType;
    @SerializedName("certificates_count")
    @Expose
    public Integer certificatesCount;
    @SerializedName("learners_count")
    @Expose
    public Integer learnersCount;
    @SerializedName("time_to_complete")
    @Expose
    public Object timeToComplete;
    @SerializedName("is_popular")
    @Expose
    public Boolean isPopular;
    @SerializedName("similar_courses")
    @Expose
    public List<Object> similarCourses = null;
    @SerializedName("is_unsuitable")
    @Expose
    public Boolean isUnsuitable;
    @SerializedName("owner")
    @Expose
    public Integer owner;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("is_featured")
    @Expose
    public Boolean isFeatured;
    @SerializedName("is_public")
    @Expose
    public Boolean isPublic;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("begin_date")
    @Expose
    public Object beginDate;
    @SerializedName("end_date")
    @Expose
    public Object endDate;
    @SerializedName("soft_deadline")
    @Expose
    public Object softDeadline;
    @SerializedName("hard_deadline")
    @Expose
    public Object hardDeadline;
    @SerializedName("grading_policy")
    @Expose
    public String gradingPolicy;
    @SerializedName("begin_date_source")
    @Expose
    public Object beginDateSource;
    @SerializedName("end_date_source")
    @Expose
    public Object endDateSource;
    @SerializedName("soft_deadline_source")
    @Expose
    public Object softDeadlineSource;
    @SerializedName("hard_deadline_source")
    @Expose
    public Object hardDeadlineSource;
    @SerializedName("grading_policy_source")
    @Expose
    public String gradingPolicySource;
    @SerializedName("is_active")
    @Expose
    public Boolean isActive;
    @SerializedName("create_date")
    @Expose
    public String createDate;
    @SerializedName("update_date")
    @Expose
    public String updateDate;
    @SerializedName("learners_group")
    @Expose
    public Object learnersGroup;
    @SerializedName("testers_group")
    @Expose
    public Object testersGroup;
    @SerializedName("moderators_group")
    @Expose
    public Object moderatorsGroup;
    @SerializedName("teachers_group")
    @Expose
    public Object teachersGroup;
    @SerializedName("admins_group")
    @Expose
    public Object adminsGroup;
    @SerializedName("discussions_count")
    @Expose
    public Integer discussionsCount;
    @SerializedName("discussion_proxy")
    @Expose
    public Object discussionProxy;
    @SerializedName("discussion_threads")
    @Expose
    public List<Object> discussionThreads = null;
    @SerializedName("lti_consumer_key")
    @Expose
    public String ltiConsumerKey;
    @SerializedName("lti_secret_key")
    @Expose
    public String ltiSecretKey;
}
