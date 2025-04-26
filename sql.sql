-- 创建项目表
CREATE TABLE project (
    id INT PRIMARY KEY AUTO_INCREMENT,  -- 项目ID，自增主键
    project_name VARCHAR(100) NOT NULL, -- 项目名称，不能为空
    project_code VARCHAR(50) NOT NULL,  -- 项目编码，不能为空
    amount DECIMAL(15, 2) NOT NULL,     -- 金额，保留两位小数
    description VARCHAR(255),           -- 项目描述，可以为空
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- 创建时间，默认为当前时间
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  -- 更新时间，默认为当前时间，更新时自动更新为当前时间
);

-- 为表添加注释
COMMENT ON TABLE project IS '项目信息表';

-- 为字段添加注释
COMMENT ON COLUMN project.id IS '项目唯一标识符';
COMMENT ON COLUMN project.project_name IS '项目名称';
COMMENT ON COLUMN project.project_code IS '项目编码';
COMMENT ON COLUMN project.amount IS '项目金额';
COMMENT ON COLUMN project.description IS '项目描述';
COMMENT ON COLUMN project.created_at IS '项目创建时间';
COMMENT ON COLUMN project.updated_at IS '项目最后更新时间';

-- 创建索引以提高查询性能
CREATE INDEX idx_project_name ON project (project_name);
CREATE INDEX idx_project_code ON project (project_code);