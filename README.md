# Adding project to your github
1. git init
2. git add .
3. git commit -m "initial commit"
4. git remote add origin {repo https link}
5. git push origin {branch name}  
   If 5 not working run 6
7. git push origin {branch name} --force
<br><br>
- Checking all branches - git branch  
- Creating a new branch - git branch {new branch name}  
- Switch to new branch - git checkout {branch name}  
- Remove the remote origin - git remote remove origin  
- Verify removal - git remote -v  
- Re-adding a remote origin - git remote add origin {repo https link}  



# Cloning a project from github
git clone {repo https link}

# Docker commands
- docker-compose up -->	Starts all services in docker-compose.yml   
- docker-compose down --> 	Stops and removes all containers   
- docker-compose up --build --> 	Rebuilds images before starting   
- docker ps -->  	Shows running containers   
- docker exec -it <container_name> bash	-->    Opens shell in a running container

# Elasticsearch API endpoints
## 📘 Common Elasticsearch REST API Endpoints

This document lists commonly used Elasticsearch REST API paths for managing indices, documents, search operations, and more.

---

## 🔍 Search & Query Endpoints

| Endpoint | Description |
|----------|-------------|
| `/_search` | Search across all indices |
| `/index_name/_search` | Search within a specific index |
| `/_msearch` | Multi-search (batch search requests) |
| `/_count` | Count number of matching documents |
| `/index_name/_count` | Count in a specific index |
| `/_validate/query` | Validate a query without executing |

---

## 📁 Index Management

| Endpoint | Description |
|----------|-------------|
| `/_cat/indices` | List all indices (with details) |
| `/_cat/indices?v` | List all indices with headers |
| `/_cat/health` | Cluster health info |
| `/index_name` | Create or manage a specific index |
| `/_aliases` | Get or update aliases for indices |
| `/_cat/aliases` | List all aliases |
| `/index_name/_settings` | View/update index settings |
| `/index_name/_mapping` | View/update index mappings |
| `/_mapping` | View mappings for all indices |

---

## 🧾 Document Operations

| Endpoint | Description |
|----------|-------------|
| `/index_name/_doc/1` | Get document with ID `1` |
| `/index_name/_doc/` | Add new document (POST) |
| `/_bulk` | Bulk insert/update/delete |
| `/index_name/_update/1` | Update part of document ID `1` |
| `/index_name/_delete_by_query` | Delete documents matching a query |

---

## ⚙️ Cluster & Node Info

| Endpoint | Description |
|----------|-------------|
| `/_cluster/health` | Health of the cluster |
| `/_cluster/stats` | Cluster statistics |
| `/_nodes` | Info about all nodes |
| `/_nodes/stats` | Detailed node stats |

---

## 📋 Templates & Pipelines

| Endpoint | Description |
|----------|-------------|
| `/_index_template` | Index templates (v7+) |
| `/_template` | Legacy index templates |
| `/_ingest/pipeline` | View or manage ingest pipelines |

---

## 🔐 Security (If Enabled)

| Endpoint | Description |
|----------|-------------|
| `/_security/user` | Manage users |
| `/_security/role` | Manage roles |
| `/_security/api_key` | Manage API keys |
